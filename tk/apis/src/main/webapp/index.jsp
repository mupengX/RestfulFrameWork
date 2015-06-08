<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<%
		String path = request.getContextPath();
		String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>在线文档</title>
  <base href="<%=basePath%>">
  <link rel='icon' href='<%=basePath %>favicon.ico'  type='image/x-icon'>
  <link rel='shortcut icon' href='<%=basePath %>favicon.ico' type='image/x-icon'>
  <link href='css/font.css?family=Droid+Sans:400,700' rel='stylesheet' type='text/css'/>
  <link href='css/highlight.default.css' media='screen' rel='stylesheet' type='text/css'/>
  <link href='css/screen.css' media='screen' rel='stylesheet' type='text/css'/>
  <script type="text/javascript" src="lib/shred.bundle.js"></script>
  <script src='lib/jquery-1.8.0.min.js' type='text/javascript'></script>
  <script src='lib/jquery.slideto.min.js' type='text/javascript'></script>
  <script src='lib/jquery.wiggle.min.js' type='text/javascript'></script>
  <script src='lib/jquery.ba-bbq.min.js' type='text/javascript'></script>
  <script src='lib/handlebars-1.0.0.js' type='text/javascript'></script>
  <script src='lib/underscore-min.js' type='text/javascript'></script>
  <script src='lib/backbone-min.js' type='text/javascript'></script>
  <script src='lib/swagger.js' type='text/javascript'></script>
  <script src='lib/swagger-client.js' type='text/javascript'></script>
  <script src='swagger-ui.js' type='text/javascript'></script>
  <script src='lib/highlight.7.3.pack.js' type='text/javascript'></script>
  <!-- enabling this will enable oauth2 implicit scope support -->
  <script src='lib/swagger-oauth.js' type='text/javascript'></script>
  <script type="text/javascript">
    $(function () {
      // modify by xiyt
      // var url = window.location.search.match(/url=([^&]+)/);
      var href = window.location.href.split("/");
      var url = "<%=basePath%>doc/api-docs";//window.location.protocol + "//" + window.location.host + "/" + href[3] + "/backend/api-docs.json";
      window.swaggerUi = new SwaggerUi({
        url: url,
        dom_id: "swagger-ui-container",
        supportedSubmitMethods: ['get', 'post', 'put', 'delete'],
        onComplete: function(swaggerApi, swaggerUi){
          log("Loaded SwaggerUI");
          if(typeof initOAuth == "function") {
            /*
            initOAuth({
              clientId: "your-client-id",
              realm: "your-realms",
              appName: "your-app-name"
            });
            */
          }
          $('pre code').each(function(i, e) {
            hljs.highlightBlock(e)
          });
        },
        onFailure: function(data) {
          log("Unable to Load SwaggerUI");
        },
        docExpansion: "none",
        sorter : "alpha"
      });

      function addApiKeyAuthorization() {
        var key = $('#input_apiKey')[0].value;
        log("key: " + key);
        if(key && key.trim() != "") {
            log("added key " + key);
            window.authorizations.add("api_key", new ApiKeyAuthorization("api_key", key, "query"));
        }
      }

      $('#input_apiKey').change(function() {
        addApiKeyAuthorization();
      });

      // if you have an apiKey you would like to pre-populate on the page for demonstration purposes...
      /*
        var apiKey = "myApiKeyXXXX123456789";
        $('#input_apiKey').val(apiKey);
        addApiKeyAuthorization();
      */
      
   // -------add request header ----start------
  	var requestHeaderTemplate = $('#requestHeaderTemp').html();
      $('#requestHeader').on('focus', '.j-header input', function(){
    		var keyOld = $(this).parent('.j-header').children('input.input_apiKey').val();
    		var valOld = $(this).parent('.j-header').children('input.input_apiVal').val();
    		$(this).off('change').on('change',function(){
    			window.authorizations.remove(keyOld);
    			var key = $(this).parent('.j-header').children('input.input_apiKey').val();
    	  		var val = $(this).parent('.j-header').children('input.input_apiVal').val();
    			if(val && val.trim() != "" && key && val.trim() != "") {
    	  	        window.authorizations.add(key, new ApiKeyAuthorization(key, val, "header"));
    	  	    }
    		})
    	});
      $('#headers').toggle(function(){
      	var left = $(this).position().left - 570;
      	var top = $(this).position().top + 30;
      	$('#requestHeader').css({"left" : left, "top" : top}).fadeIn('fast');
      }, function(){
      	$('#requestHeader').hide();
      });
      
      $('#requestHeader').on('click', '.j-header span:not(".star")', function(){
      	var key = $(this).parent('.j-header').children('input.input_apiKey').val();
      	window.authorizations.remove(key);
      	$(this).parent('.j-header').remove();
      	
      })
      
      $('#requestHeader').on('click', '.j-header:last-child input.input_apiVal', function(){
      	$(this).parents('#requestHeader').append(requestHeaderTemplate);
      	
      })
      
      // -------add request header ----end------

      window.swaggerUi.load();
  });
  </script>
</head>

<body>
<div id='header'>
  <div class="swagger-ui-wrap">
    <a id="logo" href="#"></a>
    <form id='api_selector'>
      <div class='input'><input placeholder="http://example.com/api" id="input_baseUrl" name="baseUrl" type="text"/></div>
      
      <div class='input' style="margin-right:20px;"><a id="headers" href="#">Headers</a></div>
      <div class='input'><a id="explore" href="#">Explore</a></div>
    </form>
    
  </div>

<div id="requestHeaderTemp" style="display:none;">
  <div class='input j-header'>
      <input placeholder="Header" class="input_apiKey" type="text"/>
      <input placeholder="Value" class="input_apiVal" type="text"/>
      <span>-</span>
  </div>
</div>
  
  <div id="requestHeader">
    <div class='input j-header'>
    	<input placeholder="Header" class="input_apiKey"  value="appKey" type="text" readonly required/>
    	<input placeholder="Value" class="input_apiVal" type="text" required/>
    	<span class="star">*</span>
    </div>
    <div class='input j-header'>
    	<input placeholder="Header" class="input_apiKey" value="transactionID" type="text" readonly required/>
    	<input placeholder="Value" class="input_apiVal" type="text" required/>
    	<span class="star">*</span>
    </div>
    <div class='input j-header'>
    	<input placeholder="Header" class="input_apiKey" value="reqTime" type="text" readonly required/>
    	<input placeholder="Value" class="input_apiVal" type="text" required/>
    	<span class="star">*</span>
    </div>
    <div class='input j-header'>
    	<input placeholder="Header" class="input_apiKey" value="version" type="text" readonly required/>
    	<input placeholder="Value" class="input_apiVal" type="text" required/>
    	<span class="star">*</span>
    </div>
    <div class='input j-header'>
    	<input placeholder="Header" class="input_apiKey" value="Locale" type="text" readonly required/>
    	<input placeholder="Value" class="input_apiVal" type="text" required/>
    	<span class="star">*</span>
    </div>
    <div class='input j-header'>
    	<input placeholder="Header" class="input_apiKey" value="sign" type="text"/>
    	<input placeholder="Value" class="input_apiVal" type="text"/>
    	<span>-</span>
    </div>
    <div class='input j-header'>
    	<input placeholder="Header" class="input_apiKey" value="format" type="text"/>
    	<input placeholder="Value" class="input_apiVal" type="text"/>
    	<span>-</span>
    </div>
    <div class='input j-header'>
    	<input placeholder="Header" class="input_apiKey" value="accessToken" type="text"/>
    	<input placeholder="Value" class="input_apiVal" type="text"/>
    	<span>-</span>
    </div>
    <div class='input j-header'>
    	<input placeholder="Header" class="input_apiKey" value="dstSysID" type="text"/>
    	<input placeholder="Value" class="input_apiVal" type="text"/>
    	<span>-</span>
    </div>
    <div class='input j-header'>
    	<input placeholder="Header" class="input_apiKey" value="tenantId" type="text"/>
    	<input placeholder="Value" class="input_apiVal" type="text"/>
    	<span>-</span>
    </div>
    <div class='input j-header'>
    	<input placeholder="Header" class="input_apiKey" value="acceptRegionCode" type="text"/>
    	<input placeholder="Value" class="input_apiVal" type="text"/>
    	<span>-</span>
    </div>
    <div class='input j-header'>
    	<input placeholder="Header" class="input_apiKey" value="acceptChannelCode" type="text"/>
    	<input placeholder="Value" class="input_apiVal" type="text"/>
    	<span>-</span>
    </div>
    <div class='input j-header'>
    	<input placeholder="Header" class="input_apiKey" value="acceptStaffId" type="text"/>
    	<input placeholder="Value" class="input_apiVal" type="text"/>
    	<span>-</span>
    </div>
    <div class='input j-header'>
    	<input placeholder="Header" class="input_apiKey" value="acceptOspId" type="text"/>
    	<input placeholder="Value" class="input_apiVal" type="text"/>
    	<span>-</span>
    </div>
    <div class='input j-header'>
    	<input placeholder="Header" class="input_apiKey" value="acceptLoginType" type="text"/>
    	<input placeholder="Value" class="input_apiVal" type="text"/>
    	<span>-</span>
    </div>
    <div class='input j-header'>
    	<input placeholder="Header" class="input_apiKey" value="acceptNemId" type="text"/>
    	<input placeholder="Value" class="input_apiVal" type="text"/>
    	<span>-</span>
    </div>
    <div class='input j-header'>
    	<input placeholder="Header" class="input_apiKey" value="acceptLoginStatus" type="text"/>
    	<input placeholder="Value" class="input_apiVal" type="text"/>
    	<span>-</span>
    </div>
    <div class='input j-header'>
    	<input placeholder="Header" class="input_apiKey" value="notifyFlag" type="text"/>
    	<input placeholder="Value" class="input_apiVal" type="text"/>
    	<span>-</span>
    </div>
  </div>
  
  <div style="margin-top: 55px;text-align: center;" class="swagger-ui-wrap">
     <!-- <button id="showOsesb">Sprint</button>  --> 
     <!-- <button id="showBackend">Selfcare</button> --> 
  </div>
</div>

<div id="message-bar" class="swagger-ui-wrap">
  &nbsp;
</div>

<div id="swagger-ui-container" class="swagger-ui-wrap">

</div>

<script src='lib/stickUp.min.js' type='text/javascript'></script>
<script type="text/javascript">
    //initiating jQuery
    jQuery(function($) {
        $(document).ready( function() {
            //enabling stickUp on the '.navbar-wrapper' class
            $('#header').stickUp();
        });
    });
</script>
</body>
</html> 
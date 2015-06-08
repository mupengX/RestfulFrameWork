package com.easymock;

import junit.framework.TestCase;

import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;

import com.easymock.Portfolio;
import com.easymock.Stock;
import com.easymock.StockMarket;

public class PortfolioTest extends TestCase {

	private Portfolio portfolio;
	private StockMarket marketMock;

	@Before 
	public void setUp() {
		portfolio = new Portfolio();
		portfolio.setName("Veera's portfolio.");
		//1.我们要求 EasyMock 创建一个服务于 StockMarket 接口的模拟对象。
		marketMock = EasyMock.createMock(StockMarket.class);
		portfolio.setStockMarket(marketMock);
	}

	/**
	 * 测试 Portfolio.getTotalValue() 方法
	 * 
	 * 
	 * */
	@Test
	public void testGetTotalValue() {
		//2.我们定义了这个虚拟对象的行为--例如当getPrice()对象被调用并传递 “EBAY” 参数时，模拟对象将返回 42.00 .然后我们调用 replay() 方法时，将使模拟对象备用。
		EasyMock.expect(marketMock.getPrice("EBAY")).andReturn(42.00);
		EasyMock.replay(marketMock);
		//业务逻辑数据
		//3.然后我们创建了一个数量为2的 ebayStock 股票，并将其添加到我们的 Portfolio 中。将我们设置 EBAY 价格为 42.00 时，我们便知道股票的总价格为 84.00（2*42.00）。
		Stock ebayStock = new Stock("EBAY", 2);
		portfolio.addStock(ebayStock);
		//如果 getTotalValue() 中代码不出错的话，以上测试应该会成功，否则测试将会失败
		assertEquals(84.00, portfolio.getTotalValue());
	}

}

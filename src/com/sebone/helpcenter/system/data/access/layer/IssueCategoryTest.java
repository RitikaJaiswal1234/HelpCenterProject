/**
 * 
 */
package com.sebone.helpcenter.system.data.access.layer;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;

import com.sebone.helpcenter.object.IssueCategory;

/**
 * @author Ritika Jaiswal
 *
 */
@TestMethodOrder(OrderAnnotation.class)
public class IssueCategoryTest {
	IssueCategoryDAO issueCategoryDAO = null;
	IssueCategory issuecategory = null;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		issuecategory = new IssueCategory();
		
		issuecategory.setCategoryId(124);
		issuecategory.setCategoryName("Payment");
		issuecategory.setCategoryStatus("active");
		SimpleDateFormat dateParser = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		issuecategory.setLastModifiedAt(dateParser.parse("2016-01-01 00:00:00"));
		issuecategory.setCreatedAt(dateParser.parse("2022-03-28 10:09:00"));
		
	//	issuecategory.setLastModifiedAt(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2022-03-28 10:09:00"));
		//issuecategory.setCreatedAt(new SimpleDateFormat("yyyy-mm-dd hh:mm:ss").parse("2022-03-28 10:09:00"));
		
		issuecategory.setIsGuest(1);
		issuecategory.setCategoryDescription("stuff payment");
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
		
	}

	/**
	 * Test method for {@link com.sebone.helpcenter.system.data.access.layer.IssueCategoryDAO#insert(com.sebone.helpcenter.object.IssueCategory)}.

	 */
	@Order(1)
	@Test
	public void testInsert() {
		issueCategoryDAO = new IssueCategoryDAO();
		assertEquals(true,issueCategoryDAO.insert(issuecategory));
		
	}
	
	@Test
	@Order(3)
	public void testDelete() {
		issueCategoryDAO= new IssueCategoryDAO();
		//issueCategoryDAO.delete(109);
		assertEquals(true,issueCategoryDAO.delete(issuecategory.getCategoryId()));

	}
	@Test
	@Order(2)
	public void testfindAllData() {
		issueCategoryDAO= new IssueCategoryDAO();
	
	    IssueCategory issueCategory2 = issueCategoryDAO.findAllData(issuecategory.getCategoryId());
		assertEquals(issuecategory.getCategoryId(),issueCategory2.getCategoryId());
	}
	
	@Test
	@Order(4)
	public void testupdate() {
		issueCategoryDAO= new IssueCategoryDAO();
		
		
	}
	

}

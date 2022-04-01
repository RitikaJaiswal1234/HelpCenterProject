package com.sebone.helpcenter.system.data.test;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.sebone.helpcenter.object.IssueCategory;
import com.sebone.helpcenter.system.data.access.layer.IssueCategoryDAO;

@TestMethodOrder(OrderAnnotation.class)
class IssueCategoryTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	
	@AfterEach
	void tearDown() throws Exception {
	}

	
	IssueCategoryDAO issueCategoryDAO = null;
	IssueCategory issuecategory = null;

	

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		issuecategory = new IssueCategory();
		
		issuecategory.setCategoryId(113);
		issuecategory.setCategoryName("DiLivery");
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
	 * Test method for {@link com.sebone.helpcenter.system.data.access.layer.IssueCategoryDAO#insert(com.sebone.helpcenter.object.IssueCategory)}.

	 */
	@Order(1)
	@Test
	public void testInsert() {
		IssueCategoryDAO issueCategoryDAO = new IssueCategoryDAO();
		assertEquals(true,issueCategoryDAO.insert(issuecategory));
		
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
	public void testDelete() {
		issueCategoryDAO= new IssueCategoryDAO();
		assertEquals(true,issueCategoryDAO.delete(issuecategory.getCategoryId()));

	}
	
	
	@Test
	@Order(3)
	public void testupdate() {
		issueCategoryDAO= new IssueCategoryDAO();
	    assertEquals(true,issueCategoryDAO.update(issuecategory));
		
	}	

}

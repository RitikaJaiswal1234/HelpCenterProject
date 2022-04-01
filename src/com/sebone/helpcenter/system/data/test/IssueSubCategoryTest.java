/**
 * 
 */
package com.sebone.helpcenter.system.data.test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.text.SimpleDateFormat;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.TestMethodOrder;
import com.sebone.helpcenter.object.IssueSubCategory;
import com.sebone.helpcenter.system.data.access.layer.IssueSubCategoryDAO;

/**
 * @author Ritika Jaiswal
 *
 */
@Order(1)
class IssueSubCategoryTest {
IssueSubCategoryDAO issueSubCategoryDAO = null;
IssueSubCategory issueSubCategory = null;
	/**
	 * @throws java.lang.Exception
	 */
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
       issueSubCategory = new IssueSubCategory();
		
		issueSubCategory.setsubCategoryId(132);
		issueSubCategory.setCategoryId(101);
		issueSubCategory.setSubcategorydescription("Stuff payment");
		issueSubCategory.setSubCategoryName("payment");
		issueSubCategory.setSubCategoryStatus("deactive");
		SimpleDateFormat dateParser = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		issueSubCategory.setSubCategoryCreated(dateParser.parse("2016-01-01 00:00:00"));
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	 void testinsert() {
		issueSubCategoryDAO = new IssueSubCategoryDAO();
		assertEquals(true,issueSubCategoryDAO.insert(issueSubCategory));
	}
	@Test
	@Order(2)
	void testreadData() {
		issueSubCategoryDAO = new IssueSubCategoryDAO();
		IssueSubCategory issueSubCategory2 = issueSubCategoryDAO.readData(issueSubCategory.getCategoryId());
		assertEquals(issueSubCategory.getsubCategoryId(),issueSubCategory2.getsubCategoryId());
	}
	
	@Test
	@Order(3)
	public void testupdate() {
		issueSubCategoryDAO = new IssueSubCategoryDAO();
		assertEquals(true,issueSubCategoryDAO.update(issueSubCategory));
	}
	
	@Test
	@Order(4)
	public void testdelete() {
		issueSubCategoryDAO= new IssueSubCategoryDAO();
		assertEquals(true,issueSubCategoryDAO.delete(issueSubCategory.getsubCategoryId()));
	}
		
}

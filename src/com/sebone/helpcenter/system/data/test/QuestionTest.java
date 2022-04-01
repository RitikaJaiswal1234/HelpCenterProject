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
import com.sebone.helpcenter.object.IssueCategory;
import com.sebone.helpcenter.object.Question;
import com.sebone.helpcenter.system.data.access.layer.IssueCategoryDAO;
import com.sebone.helpcenter.system.data.access.layer.QuestionDAO;

/**
 * @author Ritika Jaiswal
 *
 */
class QuestionTest extends QuestionDAO {

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
	@AfterEach
	void tearDown() throws Exception {
		
	}
	/**
	 * @param question 
	 * @throws java.lang.Exception
	 */
	@BeforeEach
	void setUp() throws Exception {
		Question question = new Question();
	    question.setQuestionId(201);
		question.setSubCategoryId(101);
		question.setFullQuestion("active");
		question.setIsGuest(true);
		question.setQuestionStatus("active");
		question.setFullAnswer("active");
		SimpleDateFormat dateParser = new SimpleDateFormat("yyyy-mm-dd HH:mm:ss");
		question.setQuestionCreatedAt(dateParser.parse("2016-01-01 00:00:00"));
		
	}		

	@Test 
		public void testInsert() {
		QuestionDAO questionDAO = new QuestionDAO();
		Question question = new Question();
		assertEquals(true,questionDAO.insert(question ));
		}
	}



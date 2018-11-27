package droolscourse;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.api.runtime.StatelessKieSession;

import util.KnowledgeSessionHelper;

@SuppressWarnings("restriction")
class TestLesson1 {
	
	StatelessKieSession sessionStateless = null;
	KieSession sessionStatefull = null;
	static KieContainer kieContainer;
	
	@BeforeClass
	public static void beforeClass() {
		kieContainer = KnowledgeSessionHelper.createRuleBase();
	}
	
	@Test
	public void testFirstOne() {
		sessionStatefull = KnowledgeSessionHelper.getStatefulKnowledgeSession(kieContainer, "ksession-rule");
		Account a = new Account();
		sessionStatefull.insert(a);
		sessionStatefull.fireAllRules();
//		fail("Not yet implemented");
	}

}

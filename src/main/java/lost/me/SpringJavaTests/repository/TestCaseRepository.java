package lost.me.SpringJavaTests.repository;

import lost.me.SpringJavaTests.model.TestCase;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TestCaseRepository extends JpaRepository<TestCase, Long> {
}
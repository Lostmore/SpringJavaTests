package lost.me.SpringJavaTests.service;

import lost.me.SpringJavaTests.model.TestCase;
import lost.me.SpringJavaTests.repository.TestCaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TestCaseService {

    private final TestCaseRepository testCaseRepository;

    @Autowired
    public TestCaseService(TestCaseRepository testCaseRepository) {
        this.testCaseRepository = testCaseRepository;
    }

    public List<TestCase> findAll() {
        return testCaseRepository.findAll();
    }

    public Optional<TestCase> findById(Long id) {
        return testCaseRepository.findById(id);
    }

    public TestCase save(TestCase testCase) {
        return testCaseRepository.save(testCase);
    }

    public void deleteById(Long id) {
        testCaseRepository.deleteById(id);
    }
}

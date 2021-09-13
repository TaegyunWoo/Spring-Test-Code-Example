package practice.testCode.study;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudyServiceTest {

    @Test
    void createStudyService() {
        /*
         StudyService 생성자의 인수로
         'MemberService'객체와, 'StudyRepository' 객체를 넣어야하지만
         현재 인터페이스만 존재하는 상황이다.
         따라서, mock 객체를 통해 StudyService 객체를 생성할 수 있다.
         */
        StudyService studyService = new StudyService();
    }
}
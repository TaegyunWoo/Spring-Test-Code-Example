package practice.testCode.study;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.exceptions.base.MockitoException;
import org.mockito.junit.jupiter.MockitoExtension;
import practice.testCode.member.MemberService;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class StudyServiceTest {

    /**
     * Mockito.mock() 으로 mock 객체 만들기
     */
    @Test
    void createStudyServiceWithMethod() {
        /*
         StudyService 생성자의 인수로
         'MemberService'객체와, 'StudyRepository' 객체를 넣어야하지만
         현재 인터페이스만 존재하는 상황이다.
         따라서, mock 객체를 통해 StudyService 객체를 생성할 수 있다.
         */
        MemberService memberService = mock(MemberService.class);
        StudyRepository studyRepository = mock(StudyRepository.class);

        StudyService studyService = new StudyService(memberService, studyRepository);
        assertNotNull(studyService);
    }

    /*
     * @Mock 애너테이션으로 mock 객체 만들기
     */

    @Test
    void createStudyServiceWithAnnotaion(@Mock MemberService memberServiceWithAnno,
                                         @Mock StudyRepository studyRepositoryWithAnno
                                         ) {
        /*
         StudyService 생성자의 인수로
         'MemberService'객체와, 'StudyRepository' 객체를 넣어야하지만
         현재 인터페이스만 존재하는 상황이다.
         따라서, mock 객체를 통해 StudyService 객체를 생성할 수 있다.
         */
        StudyService studyService = new StudyService(memberServiceWithAnno, studyRepositoryWithAnno);
        assertNotNull(studyService);
    }
}
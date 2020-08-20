import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * solutions from: https://github.com/nayuki/Project-Euler-solutions/blob/master/Answers.txt
 */
public class ProjectEulerTest {
    @Test
    public void test_euler1() {
        assertThat(ProjectEuler.euler1(), is(233168));
    }

    @Test
    public void test_euler2() {
        assertThat(ProjectEuler.euler2(), is(4613732));
    }

    @Test
    public void test_euler3() {
        assertThat(ProjectEuler.euler3(), is(6857L));
    }

    @Test
    public void test_euler4() {
        assertThat(ProjectEuler.euler4(), is(906609));
    }

    @Test
    public void test_euler5() {
        assertThat(ProjectEuler.euler5(), is(232792560));
    }

    @Test
    public void test_euler6() {
        assertThat(ProjectEuler.euler6(), is(25164150));
    }

    @Test
    public void test_euler7() {
        assertThat(ProjectEuler.euler7(), is(104743));
    }

    @Test
    public void test_euler8() {
        assertThat(ProjectEuler.euler8(), is(23514624000L));
    }

    @Test
    public void test_euler9() {
        assertThat(ProjectEuler.euler9(), is(31875000));
    }

    @Test
    public void test_euler10() {
        assertThat(ProjectEuler.euler10(), is(142913828922L));
    }

    @Test
    public void test_euler11() {
        assertThat(ProjectEuler.euler11(), is(70600674));
    }

    @Test
    public void test_euler12() {
        assertThat(ProjectEuler.euler12(), is(76576500));
    }
}

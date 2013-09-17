package com.github.eirslett.sc8;

import com.twitter.util.Await;
import com.twitter.util.Future;
import org.junit.Test;

import static com.github.eirslett.sc8.Sc8.C;
import static com.github.eirslett.sc8.Sc8.F;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Sc8Test {
    @Test
    public void should_create_scala_function_from_lambda(){
        scala.Function2 f = F((String s,String t) -> s.equals(t));
    }

    @Test
    public void should_return_length_of_string() throws Exception {
        int result = Transformers.stringProcessor("Hello", F(s -> s.length()));
        assertThat(result, is(5));
    }

    @Test
    public void should_calculate_with_many_inputs() throws Exception {
        int result = Transformers.performCalculation(
                1,2,3,
                F((a, b, c) -> (int)a + (int)b + (int)c));
        assertThat(result, is(6));
    }

    @Test
    public void should_do_something_with_a_future() throws Exception {
        Transformers.somethingInTheFuture()
                .map(F(s -> s.toUpperCase()))
                .onSuccess(C(s -> System.out.println(s)));
    }

    // Transform HEY to hey, then find index of "y"
    @Test
    public void more_future_processing() throws Exception {
        Future<Integer> indexFuture = Future.value("HEY")
                .map(F(s -> s.toLowerCase()))
                .map(F(s -> s.indexOf("y")));
        Integer index = Await.result(indexFuture);
        assertThat(index, is(2));
    }
}

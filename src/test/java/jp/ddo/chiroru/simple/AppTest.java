package jp.ddo.chiroru.simple;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AppTest {

	@Test
	public void addTest() throws Exception {
		assertThat(App.add(1, 1), is(2));
	}

	@Test
	public void subTest() throws Exception {
		assertThat(App.sub(2, 1), is(1));
	}
}
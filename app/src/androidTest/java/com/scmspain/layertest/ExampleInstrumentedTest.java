package com.scmspain.layertest;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.layer.sdk.messaging.Conversation;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

  @Test
  public void layerTest () {
    Conversation conversation = Mockito.mock(Conversation.class, Mockito.CALLS_REAL_METHODS);

    given(conversation.getTotalMessageCount()).willReturn(3);

    int messages = conversation.getTotalMessageCount();

    assertEquals(3, messages);
  }
}

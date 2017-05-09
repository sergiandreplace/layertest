package com.scmspain.layertest;

import com.layer.sdk.LayerClient;
import com.layer.sdk.messaging.Conversation;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

public class ExampleUnitTest {


  @Test
  public void layerTest () {
    Conversation conversation = Mockito.mock(Conversation.class);
    Mockito.doReturn(3).when(conversation).getTotalMessageCount();

    int messages = conversation.getTotalMessageCount();

    assertEquals(3, messages);
  }
}

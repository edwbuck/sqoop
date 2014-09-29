/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sqoop.model;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Test class for org.apache.sqoop.model.MConnectionForms
 */
public class TestMConnectionForms {

  /**
   * Test for class initialization and values
   */
  @Test
  public void testInitialization() {
    List<MForm> forms = new ArrayList<MForm>();
    MConnectionForms connectionForms1 = new MConnectionForms(forms);
    List<MForm> testForms = new ArrayList<MForm>();
    assertEquals(testForms, connectionForms1.getForms());
    MConnectionForms connectionForms2 = new MConnectionForms(testForms);
    assertEquals(connectionForms2, connectionForms1);
    // Add a form to list for checking not equals
    MForm m = new MForm("test", null);
    testForms.add(m);
    assertFalse(connectionForms1.equals(connectionForms2));
  }
}

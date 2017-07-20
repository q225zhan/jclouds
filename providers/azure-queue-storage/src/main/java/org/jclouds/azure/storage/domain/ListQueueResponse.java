/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jclouds.azure.storage.domain;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "EnumerationResults")
@XmlAccessorType(XmlAccessType.FIELD)
public class ListQueueResponse {

   @XmlRootElement(name = "Queue")
   @XmlAccessorType(XmlAccessType.FIELD)
   public static class Queue {
      @XmlElement(name = "QueueName")
      private String name;

      @XmlElement(name = "Url")
      private String url;

      public String getName() {
         return name;
      }

      public void setName(String name) {
         this.name = name;
      }

      public String getUrl() {
         return url;
      }

      public void setUrl(String url) {
         this.url = url;
      }
   }

   @XmlElementWrapper(name="Queues")
   @XmlElement(name = "Queue")
   private List<Queue> queues;

   public List<Queue> getQueues() {
      return queues;
   }

   public void setQueues(List<Queue> queues) {
      this.queues = queues;
   }

}

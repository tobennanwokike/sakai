/**********************************************************************************
 * $URL$
 * $Id$
 ***********************************************************************************
 *
 * Copyright (c) 2003, 2004, 2005, 2006 The Sakai Foundation.
 * 
 * Licensed under the Educational Community License, Version 1.0 (the "License"); 
 * you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at
 * 
 *      http://www.opensource.org/licenses/ecl1.php
 * 
 * Unless required by applicable law or agreed to in writing, software 
 * distributed under the License is distributed on an "AS IS" BASIS, 
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. 
 * See the License for the specific language governing permissions and 
 * limitations under the License.
 *
 **********************************************************************************/

package org.sakaiproject.tool.podcasts;

import javax.faces.model.SelectItem;

public class podOptionsBean {
  private int podOption;
  
  private static final int PUBLIC = 0;
  private static final int SITE = 1;
  
  private SelectItem [] displayItems = new SelectItem [] {
    new SelectItem(new Integer(PUBLIC), "Display to Public"),
    new SelectItem(new Integer(SITE), "Display to Site")
  };
  
  public podOptionsBean () {
	  podOption = 0;
  }
  
  public podOptionsBean (int option) {
	  podOption = option;
  }
  
  public int getPodOption() {
	  return podOption;
  }
  
  public void setPodOption(int option) {
	  podOption = option;
  }

  public SelectItem [] getDisplayItems () {
	  return displayItems;
  }
  
  public String processOptionChange() {
	  return "cancel";
  }
  
  public String processOptionCancel() {
	  return "cancel";
  }

}

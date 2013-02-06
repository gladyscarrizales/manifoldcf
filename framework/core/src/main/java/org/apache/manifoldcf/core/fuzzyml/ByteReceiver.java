/* $Id$ */

/**
* Licensed to the Apache Software Foundation (ASF) under one or more
* contributor license agreements. See the NOTICE file distributed with
* this work for additional information regarding copyright ownership.
* The ASF licenses this file to You under the Apache License, Version 2.0
* (the "License"); you may not use this file except in compliance with
* the License. You may obtain a copy of the License at
*
* http://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package org.apache.manifoldcf.core.fuzzyml;

import org.apache.manifoldcf.core.interfaces.*;
import java.io.*;

/** This class represents a receiver for bytes.
* Extenders of this class will accept an input stream,
* and will read from it as requested a chunk at a time.
*/
public abstract class ByteReceiver
{
  protected InputStream inputStream = null;
  
  /** Constructor */
  public ByteReceiver()
  {
  }
  
  /** Set the input stream.  The input stream must be
  * at the point where the bytes being received would start.
  * The stream is expected to be closed by the caller, when
  * the operations are all done.
  */
  public void setInputStream(InputStream is)
    throws IOException
  {
    this.inputStream = is;
  }
  
  /** Read the byte stream and process a limited chunk of bytes,
  *@return true if end reached.
  */
  public abstract boolean dealWithBytes()
    throws IOException, ManifoldCFException;
  
  /** Finish up all processing.
  */
  public void finishUp()
    throws ManifoldCFException
  {
  }

}

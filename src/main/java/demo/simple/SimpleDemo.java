/*
 * File created on Jul 19, 2013
 *
 * Copyright 2008-2013 Virginia Polytechnic Institute and State University
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package demo.simple;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.util.Properties;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;

import demo.ModelFactory;

/**
 * Demo main entry point.
 *
 * @author Carl Harris
 */
public class SimpleDemo {

  public static void main(String[] args) throws Exception {
    
    VelocityEngine engine = new VelocityEngine();
    engine.init(loadProperties("velocity.properties"));
    
    VelocityContext context = new VelocityContext();
    context.put("intf", ModelFactory.routerInterface());
    
    Template template = engine.getTemplate("templates/intf.vm");
    OutputStreamWriter writer = new OutputStreamWriter(System.out, "UTF-8");
    template.merge(context, writer);
    writer.close();
  }

  private static Properties loadProperties(String resource) throws IOException {
    InputStream inputStream = SimpleDemo.class.getClassLoader()
        .getResourceAsStream(resource);
    if (inputStream == null) {
      throw new FileNotFoundException(resource);
    }
    try {
      Properties props = new Properties();
      props.load(inputStream);
      return props;
    }
    finally {
      try {
        inputStream.close();
      }
      catch (IOException ex) {
        ex.printStackTrace(System.err);
      }
    } 
  }
  
}

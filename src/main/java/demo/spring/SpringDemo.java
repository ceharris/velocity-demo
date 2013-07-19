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

package demo.spring;

import java.io.OutputStreamWriter;
import java.io.Writer;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.ModelFactory;

/**
 * Main entry point for the Spring-based demo.
 *
 * @author Carl Harris
 */
public class SpringDemo {

  public static void main(String[] args) throws Exception {
    ClassPathXmlApplicationContext appContext = 
        new ClassPathXmlApplicationContext("applicationContext.xml");
    
    VelocityEngine engine = appContext.getBean(VelocityEngine.class);
  
    VelocityContext context = new VelocityContext();
    context.put("intf", ModelFactory.routerInterface());
    
    Template template = engine.getTemplate("templates/intf.vm");
    Writer writer = new OutputStreamWriter(System.out, "UTF-8");
    template.merge(context, writer);
    writer.close();
    
    appContext.close();
  }
  
}

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

package demo;

/**
 * A simple bean representing a router interface.
 * 
 * @author ceharris
 */
public class RouterInterface {

  private String name;
  private String description;
  private String ipv4Address;
  private String ipv6Address;
  private int mtu;

  /**
   * Gets the {@code name} property.
   * @return property value
   */
  public String getName() {
    return name;
  }

  /**
   * Sets the {@code name} property.
   * @param name the value to set
   */
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Gets the {@code description} property.
   * @return property value
   */
  public String getDescription() {
    return description;
  }

  /**
   * Sets the {@code description} property.
   * @param description the value to set
   */
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Gets the {@code ipv4Address} property.
   * @return property value
   */
  public String getIpv4Address() {
    return ipv4Address;
  }

  /**
   * Sets the {@code ipv4Address} property.
   * @param ipv4Address the value to set
   */
  public void setIpv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
  }

  /**
   * Gets the {@code ipv6Address} property.
   * @return property value
   */
  public String getIpv6Address() {
    return ipv6Address;
  }

  /**
   * Sets the {@code ipv6Address} property.
   * @param ipv6Address the value to set
   */
  public void setIpv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
  }

  /**
   * Gets the {@code mtu} property.
   * @return property value
   */
  public int getMtu() {
    return mtu;
  }

  /**
   * Sets the {@code mtu} property.
   * @param mtu the value to set
   */
  public void setMtu(int mtu) {
    this.mtu = mtu;
  }

}

package demo;

public class ModelFactory {

  public static RouterInterface routerInterface() {
    RouterInterface intf = new RouterInterface();
    intf.setName("xe-1/0/0");
    intf.setDescription("link to bur-mx xe-1/0/0");
    intf.setIpv4Address("128.173.1.4/30");
//    intf.setIpv6Address("2001:468:c80:f260::1/64");
    intf.setMtu(9216);
    return intf;
  }
  
}

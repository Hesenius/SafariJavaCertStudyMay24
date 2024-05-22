package hiddenimpl;

import service.MyServiceIf;

public class MyServiceImpl implements MyServiceIf {
  @Override
  public String getServiceMessage() {
    return "This is a message computed by a service";
  }
}

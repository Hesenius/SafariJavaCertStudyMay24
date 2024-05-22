//import hiddenimpl.MyServiceImpl;
//import service.MyServiceIf;

/*open*/ module my.srv {
  exports service /*to my.client, does.not.exist*/;
  opens service to my.client;
  provides service.MyServiceIf with hiddenimpl.MyServiceImpl;
}
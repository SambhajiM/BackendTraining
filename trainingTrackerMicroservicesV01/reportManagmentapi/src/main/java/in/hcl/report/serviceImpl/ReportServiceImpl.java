package in.hcl.report.serviceImpl;

import org.apache.catalina.User;
import org.springframework.stereotype.Service;

import antlr.collections.List;

@Service
public class ReportServiceImpl implements ReportService {



@Override
public List<User> findUserByAddress(List<User> users) {
//User user=new User();
List<User> userByAddress = null;
String address="Chennai";
if(users!=null) {
for(User user:users) {
if(user.getAddress()==address) {
userByAddress.add(user);
}
// return new ResponseEntity<List<User>>(userByAddress, HttpStatus.FOUND);
}
// return new ResponseEntity<String>("No User with "+address+" is existing", HttpStatus.BAD_REQUEST) ;
//}
}
return userByAddress;
}
}
package kg.marsel.emailmaker.service.impl;

import kg.marsel.emailmaker.model.User;
import kg.marsel.emailmaker.response.EmailResponse;
import kg.marsel.emailmaker.service.UserService;
import org.springframework.stereotype.Service;

import java.util.Locale;


@Service
public class UserServiceImpl implements UserService {
    @Override
    public EmailResponse createEmail(User user) {
        if(user==null){
            throw new NullPointerException();
        }
        String name = user.getName().toLowerCase();
        String surname = String.valueOf(user.getSurname().charAt(0)).toUpperCase()+user.getSurname().substring(1).toLowerCase();
        String company = user.getCompany().toLowerCase()+".com";

        return new EmailResponse(name+surname+"@"+company);
    }
}

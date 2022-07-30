package kg.marsel.emailmaker.service;

import kg.marsel.emailmaker.model.User;
import kg.marsel.emailmaker.response.EmailResponse;

public interface UserService {

    EmailResponse createEmail(User user);

}

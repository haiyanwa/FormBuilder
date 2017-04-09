package formbuilder.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import formbuilder.model.core.User;
import formbuilder.model.core.dao.UserDao;

@Service("userService")
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
	private UserDao userDao;

    @Override
    public UserDetails loadUserByUsername( String username )
        throws UsernameNotFoundException, DataAccessException
    {
		User user = userDao.getUserByUsername(username);
        if( user == null )
            throw new UsernameNotFoundException( username + " is not found." );

        return user;
    }

}

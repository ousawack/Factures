package ma.epolytechnique.ExamenFinalFacture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(securedEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	
	@Autowired
	  public void config_global(AuthenticationManagerBuilder auth) throws Exception
	  {
		auth.inMemoryAuthentication().withUser("ousama").password("{noop}pass").roles("ADMIN");
		auth.inMemoryAuthentication().withUser("gringo").password("{noop}pass").roles("VISITOR"); 
	  }

	@Override
	protected void configure(HttpSecurity http) throws Exception 
	{
	    http.csrf().disable() 	    
	    	.authorizeRequests()
	    		.anyRequest()
	    			.authenticated()
	    				.and()
	        .formLogin()
	        	.loginPage("/login")
	        	.permitAll()
	        .defaultSuccessUrl("/index")
	        .and()
	        .logout()
	        .logoutUrl("/logout").permitAll().clearAuthentication(true).logoutSuccessUrl("/login?loggedout");		        	
	}

}
package br.com.sgtp.todolist.filter;

import java.io.IOException;
import java.util.Base64;

import org.apache.tomcat.util.http.parser.Authorization;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

//filtro para o cadastro de tasks
@Component
public class FilterTaskAuth extends OncePerRequestFilter {

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
            throws ServletException, IOException {

                //Pegar autenticação (uaername e password)
                var authorization = request.getHeader("Authorization");

                var authEncoded = authorization.substring("Basic" .length()).trim();

                byte[] Base64.getDecoder().decode(authEncoded);

                var authString = new String(authEncoded);

                String[] crendentials = authString.split(":");
                String username = crendentials[0];
                String password = crendentials[1];


                //Validar user

                //Validar senha
        
                filterChain.doFilter(request, response);
    }



    

   
}

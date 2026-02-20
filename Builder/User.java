package Builder;

import com.sun.source.doctree.UsesTree;

import java.nio.file.attribute.UserPrincipal;

public class User {

    private final  String userID;
    private final String userName;
    private final String email;

    private User(UserBuilder builder) {
        this.userID = builder.userID;
        this.userName = builder.userName;
        this.email = builder.email;
    }

    public String getUserID() {
        return userID;
    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    @Override
    public String toString() {
        return this.userName + " " +  this.email + " " + this.userID;
    }

    static class UserBuilder{
        private String userID;
        private String userName;
        private String email;

        public UserBuilder(){

        }

        public UserBuilder setUserID(String userID){
            this.userID=userID;
            return this;
        }

        public UserBuilder setUserName(String userName){
            this.userName=userName;
            return this;
        }

        public UserBuilder setEmail(String email){
            this.email=email;
            return this;
        }

        public User  createUser(){
            return new User(this);
        }
    }
}



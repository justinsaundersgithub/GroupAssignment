public class Controller {
    private String username;
    private Model model;
    private View user;

    public void loginRequest(String username, String password){
        if(model.verifyCredentials(username, password)){
            model.attachUser(this);                         //The controller attaches itself to the user list in the model so that it can be notified of changes
            user.switchWindow("landingPage");   //Tell the view to switch windows
        }
        else{
            /*Todo
            Throw an exception and output an error message to the user
            in the view
             */
        }
    }

    public void registerRequest(String username, String email, String password){
        if(model.registerUser(username,email,password)){
            loginRequest(username,password);
        }
        else{
            /*Todo
            Throw some exception or handle the case that the username or account already exists.
            Output something to the view to indicate that there is an error.
             */
        }
    }

    public void accountRecovery(String email){
        try {
            model.recoverPassword(email);
            /*Todo
            If this doesnt fail, we will need to have a window pop up that has
            the users password displayed
             */
        }
        catch (NoSuchAccountException e){
            /*Todo
            Call the view to display an error message
             */
        }
    }
    //This method will be called when the window is closed and the user exits the program
    public void userExit(){
        model.detachUser(this);
    }

    public void receiveMessage(String message){
        /*Todo

         */
    }


}

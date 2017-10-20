package movil.mychat.utils

/**
 * Created by haurbano on 19/10/2017.
 */

class EmailValidator{
    companion object {
        fun validEmail(email : String) : Boolean{
            if (email.isEmpty())
                return false
            else
                return email.matches("[a-zA-Z0-9._-]+@[a-z]+\\.+[a-z]+".toRegex())
        }
    }

}
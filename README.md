# Password-Strength-Categorization

Often we require to set up passwords while making a new account on different platforms. There are certain things which can be done to make your password secure from potential threats. It is therefore recommended to keep certain things in mind and follow some practices in order to make your password fool-proof. This program checks the strength of your password on the following parameters:

1. **Password is atleast 8 characters long**
2. **Password is atmost 16 characters long**
3. **Password contains atleast one lowercase letter**
4. **Password contains atleast one uppercase letter**
5. **Password contains atleast one special character**
6. **Password contains atleast one digit**
7. **Password doesn't have 3 uppercase or 3 lowercase letters together (for instance, sequences such as _'...UJL..'_ or _'...asg...'_ are not allowed)**
8. **Password doesn't have 2 consecutive digits one after the other (for instance, _'....45...'_ is not allowed whereas _'....46...'_ is allowed)**

----  
  
Now remember this program's function is to determine the strength of your password on the above parameters and not to restrict you from creating a password which violates one or more of these conditions. Hence for the purpose of strength categorization, we will create certain conditions and assign numerical values to denote the strength where higher the number, higher is the strength of the password. The program counts how many of the above conditions are met by the input password. Based on that:


1. **If count<2, strength = 0**
2. **If count is between 2 and 4 inclusive, strength = 1**
3. **If count is between 5 and 7 inclusive, strength = 2**
4. **If all 8 conditions are met, strength = 3**

----  
  
Hence, strength of 3 denotes a highly secure password whereas a strength of 0 denotes a very weak password.

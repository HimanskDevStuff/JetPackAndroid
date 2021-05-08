# Connecting ActionBar & Menu to Navigation Component
	
## First Approach
  • Find NavHostFragment in activityMain class and then find navcontroller
	
  • Connect navController with setupActionBarWithNavcontroller
	
  • Rest all things like handling fragmentBackStack,back button press and other stuff will be taken care automatically by the navigation component.

![image](https://user-images.githubusercontent.com/66693732/117541206-69825500-b030-11eb-9b2f-8db57039a6cb.png)

• Setting the back button click.

![image](https://user-images.githubusercontent.com/66693732/117541234-89b21400-b030-11eb-92a4-68777a4698d6.png)

• Creating options menu for actionBar

![image](https://user-images.githubusercontent.com/66693732/117541246-9afb2080-b030-11eb-87f8-23b20d2fd38b.png)

• Make sure to give ID name same as the fragment id in which you want to navigate to.

![image](https://user-images.githubusercontent.com/66693732/117541268-b6fec200-b030-11eb-9e12-4bf2430fa78e.png)

• Handle item clicks.

![image](https://user-images.githubusercontent.com/66693732/117541285-cb42bf00-b030-11eb-85d5-7257900add8b.png)

*onNavDestinationSelected is a method in navigation component library .
If the item id (which is settingFragment in our case) matches with a existing fragment id then it will automatically navigate to that fragment.*

• Add menuCategory to the item so that if we press back button it doesn’t go to the home fragment again.

![image](https://user-images.githubusercontent.com/66693732/117541379-3ab8ae80-b031-11eb-9889-d355f0ab37cc.png)

## Second Approach

• In this approach we can navigate to setting fragment from any fragment in that activity using global action.

• It comes with drawbacks like it doesn't have compile time safety. So for example if we add an id of other items then it will not give us compile time error but when we will run the app it will crash. So, it doesn’t gurantee compile time safety.

• For this reason we have global actions
 ### Setting up global action for new fragment "Terms & Conditions"
 
 • Create a new fragment and name it "Terms & Conditon"

 • Make it global
 
 ![image](https://user-images.githubusercontent.com/66693732/117542152-1959c180-b035-11eb-8ee9-c9d7f84007b3.png)

*Now it is accessible in every fragment of this activity*

• Global action

![image](https://user-images.githubusercontent.com/66693732/117542193-48703300-b035-11eb-903d-eabdd4f3187f.png)

• Add TermsAndCondition item to the menu.

![image](https://user-images.githubusercontent.com/66693732/117542220-5b830300-b035-11eb-8376-8b728245df39.png)







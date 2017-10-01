# springQuickStartHelloWorldXml
##
here we will figure out the problems and will notedown their solutions
##
1.after making changes in pom file ,getting artifact errors
	sol: simply update the project -> properties->maven->update project.
##
2.The requested resource is not available.
	sol:sol: no proper url binding check requestmappingis correct or not
		or the method itself is not defined.
##
3. use ${} in place of $()

so what have you done upto yet?
created a simple hello applicartion in which rendering a jsp page at server
with hardcoded value hello
next u have passed some value from controller to jsp page inspite of hardcoding

let me write whole the steps here for step 1 ok.
step 1-create a web.xml file with a single servlet helloworld and its mapping as "/".
step 2-create spring -servlet.xml where we define whole of our applications configuration
	like beans , component scan (to scan all the package) and one view resolver
step3-create a controller "hello" which return simple jsp file "index "
step4- create a jsp file in web-inf folder that will be displayed when controller executes



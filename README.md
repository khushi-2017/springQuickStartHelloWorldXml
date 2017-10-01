# springQuickStartHelloWorldXml

here we will figure out the problems and will notedown their solutions <br />
1.after making changes in pom file ,getting artifact errors <br />
	sol: simply update the project -> properties->maven->update project. <br />
2.The requested resource is not available. <br />
	sol:sol: no proper url binding check requestmappingis correct or not or the method itself is not defined. <br />
3. use ${} in place of $() <br />

so what have you done upto yet? <br />
created a simple hello applicartion in which rendering a jsp page at server with hardcoded value hello <br />
next u have passed some value from controller to jsp page inspite of hardcoding <br />

let me write whole the steps here for step 1 ok. <br />
step 1-create a web.xml file with a single servlet helloworld and its mapping as "/". <br />
step 2-create spring -servlet.xml where we define whole of our applications configuration <br />
	like beans , component scan (to scan all the package) and one view resolver <br />
step3-create a controller "hello" which return simple jsp file "index " <br />
step4- create a jsp file in web-inf folder that will be displayed when controller executes <br />

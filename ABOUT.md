# Hotel offers filter project
Hotel offers filter is simple web project conatin one page, the page header is filter on and the body is list of offers.You can use filter to filter on city name, check-in date, check-out date and hotel class.


### Heroku Link
https://arcane-plains-29017.herokuapp.com/

## TDD Is The Development Process For These Project
I try to develope the biggest part of project using TDD technigue, unfortunatly for time constraint some part of code have no test cases, althoght there is no integration test.

## Used Technology
* Spring mvc
* jsp
* html , bootstrap and jquery
* Herku , Travis-CI


## Project module
* Web module
* Expedia offer module
* Web service module

### Web Module

These is entry point for project it contain web controller while the project it to simple, I decide to make these module is the main and implementation injector for   others module. 

The module has reference on expedia offer module which reporesent bussnies module and web service module which is the data source for other module.
In these module I take simple process, First of all I checked the web service to get type of information that the web service will provided for me then I checked query parameter to understand kind of filter I can build.

After that I start to build front end page, the page include filter criteria field and preview offers for selected criteria.
I use html, bootstrap and jquery with jsp to build dynamic server side rendering web page.

As controller I used spring mvc, it give you good ability to render request parameter and control cahce for static resources, to achive high availability for server while as you know there is blocking operation (webservice call), I used Async servlet to release servlet thread and allow it to handle other request.

### Expedia Offer Module

These module where the application logic exsist, these module has no refence to other module. In these module I avoid to use any framework to keep it simple and to keep it easier to test, while these module have no reference to other module, I define his boundary (or gateway) as interface and let main module to inject his required services. to achive these goal I develop simple service locator.

In these module I try to avoid overarchitect but keep SOLID principle in mind, to save ability to grow for these module.


### Web Service Module
These module is too simple, it represent on of system boundary, web module inject it to expedia offer module throght service locator.
In theses module filter conver to url parameter and convert returned json as offer info. these is the only affected module in the system in case of changes for web service.

## Programming language :
I pickup java for next reasons:
*  Java statically-typed language, so using java will limit number of strange, unexpected error and help to build strong IDE with advance refactoring utility.
*  Open source with large number of community, which mean large number of useful tools, framework and api.
*  Cross platform then write once run any where.
*  Also I have good experience in java.
*  I have 2 year's and 5 month of experince in java.
		

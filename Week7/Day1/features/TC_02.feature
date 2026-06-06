Feature: CreateLead functionality for LeafTaps Application

Background:
Given Launch the Browser and Load the url

Scenario Outline: CreateLead with multiple data 
When Enter the Username 'democsr2'
When Enter the password 'crmsfa'
When click on Login button
When click on crmsfa button
And click on LeadsLink
And click on CreateleadLink
When Enter the companyName <companyName>
When Enter the firstName <firstName>
When Enter the lastName <lastName>
And Click on SubmitButton
Then ViewLeadsPage is displayed

Examples:
|companyName|firstName|lastName|
|infosys|Ramkumar|R|
|Tcs|vaishali|V|
|Accenture|pavan|N|
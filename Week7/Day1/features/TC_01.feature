Feature: Login functionality for LeafTaps Application

Background:
Given Launch the Browser and Load the url

Scenario: Login with positive credentials

When Enter the Username 'democsr2'
When Enter the password 'crmsfa'
When click on Login button
Then HomePage is displayed

Scenario: Login with negative credentials

When Enter the Username 'demo'
When Enter the password 'crmsfa'
When click on login button
But Error msg is displayed
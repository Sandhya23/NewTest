$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("VechileVerifications.feature");
formatter.feature({
  "line": 2,
  "name": "To test and validate vechile make and colour",
  "description": "//Scenario: Verify vehicle color, make and match to expected value in DVLA site to the values in test date\r\n//  Given I scan the directory to retrieve supported \"xlsx\" files\r\n//  And I read vehicle reg numbers from files\r\n//  And I launch DVLA site\r\n//  When I search for vehicle info by reg number\r\n // Then I should be able match the expected color and make of the vehicle from the given file",
  "id": "to-test-and-validate-vechile-make-and-colour",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@VechicleRegistrationEnquiry"
    }
  ]
});
formatter.scenario({
  "line": 10,
  "name": "Verify vehicle color, make match to expected value in DVLA site to the values in test data from respective CSV file",
  "description": "",
  "id": "to-test-and-validate-vechile-make-and-colour;verify-vehicle-color,-make-match-to-expected-value-in-dvla-site-to-the-values-in-test-data-from-respective-csv-file",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I scan the directory to retrieve supported \"csv\" files",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I read vehicle reg numbers from files",
  "keyword": "And "
});
formatter.step({
  "line": 13,
  "name": "I launch DVLA site",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "I search for vehicle info by reg number",
  "keyword": "When "
});
formatter.step({
  "line": 15,
  "name": "I should be able match the expected color and make of the vehicle from the given file",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "csv",
      "offset": 44
    }
  ],
  "location": "VechileVerifications.i_scan_the_directory_to_retrieve_the_supported_csv_xlsx_files(String)"
});
formatter.result({
  "duration": 1408874407,
  "status": "passed"
});
formatter.match({
  "location": "VechileVerifications.i_read_vehicle_reg_numbers_from_one_of_the_file()"
});
formatter.result({
  "duration": 874895738,
  "status": "passed"
});
formatter.match({
  "location": "VechileVerifications.i_launch_dvla_site()"
});
formatter.result({
  "duration": 26216153561,
  "status": "passed"
});
formatter.match({
  "location": "VechileVerifications.i_search_for_vehicle_info_by_reg_number()"
});
formatter.result({
  "duration": 13667180993,
  "status": "passed"
});
formatter.match({
  "location": "VechileVerifications.i_should_be_able_match_the_expected_color_and_make_from_the_given_file()"
});
formatter.result({
  "duration": 483763,
  "status": "passed"
});
});
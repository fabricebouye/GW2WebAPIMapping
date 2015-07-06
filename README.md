# gw2-web-api-mapping
A Java 8 based mapping of the GW2 JSON Web API.

This project defines Java classes and enums that may be used to map the JSON GW2 Web API V2 in Java projects.
It will also contain selected parts of the API V1.
The code in this mapping requires JDK8 compatible IDE and compilers.
The project within this repository is compatible with NetBeans 8.0.2.

Current focus is on the implementation and testing of the new API V2 features.
Some features that are currently missing from API V2 will be implemented in API V1. 
I may back port duplicate features from V2 to V1 (ie: colors) if I find the time to do it.
I do not expect to provide implementation for deprecated V1 and V2 features (at least not on the short term).

This project does not contain any JSON parsing. 
A default implementation built on top of JSR 353 JSON-P will be provided in a separate repository + project, so this mapping can be reused with a different JSON parser for those who prefer it this way.

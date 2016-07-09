# dropwizard-example

Minimal template for microservice using dropwizard framework. Base extensively on original example from dropwizard sources.

Changes so far:
  * minimal dependencies - only core and auth package of dropwizard used; all other features (assets, db, templates, etc.) removed
  * uses gradle to build:
    - jgitver plugin to support maven-style automatic versioning
    - one-jar plugin to compile easily to fat jar containing all necessary dependencies to run
  * script for easy setup of graphite is provided in prov folder for easy metrics storage/preview

## License
Apache License v.2.0 - see LICENSE.

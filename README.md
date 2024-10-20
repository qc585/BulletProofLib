## To Build
1. In BulletProofLib dir, run
   ```$ mvn clean package```
   then
   ```$ mvn clean install```.
   This will package the efficientct dir and install this package into the local repository to be used as a dependency in efficientctbenchmark.
2. Go to the efficientctbenchmark by
   ```$ cd efficientctbenchmark```.
   Run
   ```$ mvn clean package```
   and
   ```$ mvn clean verify```.
## Generate benchmarks
In the efficientctbenchmark dir, run
   ```$ java -jar target/benchmarks.jar```.

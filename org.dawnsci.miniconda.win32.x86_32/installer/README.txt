The names of the platform-specific Miniconda installers are specified in:
    org.dawnsci.miniconda.linux.x86_64/installer/miniconda_installer.txt
    org.dawnsci.miniconda.linux.x86_32/installer/miniconda_installer.txt
    org.dawnsci.miniconda.win32.x86_64/installer/miniconda_installer.txt
    org.dawnsci.miniconda.win32.x86_32/installer/miniconda_installer.txt

The names specified there must match the names specified in:
    org.dawnsci.miniconda.feature/build.properties
(testing in 2012/05 showed that using wildcards in filenames in build.properties did not work)

The actual installers are not checked in to the repository, due to their size.
Instead, the installers are downloaded from: http://conda.pydata.org/miniconda.html,
and then put on the file system at /dls_sw/dasc/jenkins/miniconda-images/

The installers are copied into the product when it is created, using the root files rules specified in:
    org.dawnsci.miniconda.feature/build.properties
This requires the org.dawnsci.miniconda.<platform> fragments to have a fixed name (hence no ".qualifier" in the version)

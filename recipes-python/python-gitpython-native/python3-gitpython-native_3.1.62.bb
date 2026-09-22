SUMMARY = "GitPython is a python library used to interact with Git repositories"
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5279a7ab369ba336989dcf2a107e5c8e"

DEPENDS += "python3-gitdb-native"

PYPI_PACKAGE = "GitPython"

SRC_URI[md5sum] = "8edd60d8fb55cae85a19a40f3708568f"
SRC_URI[sha256sum] = "1791de66309bc0c7cfca40bf8d2e3de7ca091cbf94e6051be1ad0722c61062af"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-datetime \
    nativesdk-python3-gitdb \
    nativesdk-python3-io \
    nativesdk-python3-logging \
    nativesdk-python3-mmap \
    nativesdk-python3-netclient \
    nativesdk-python3-shell \
    nativesdk-python3-stringold \
    nativesdk-python3-tests \
    nativesdk-python3-unixadmin \
"

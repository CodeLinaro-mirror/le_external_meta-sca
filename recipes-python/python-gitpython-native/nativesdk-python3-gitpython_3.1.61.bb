SUMMARY = "GitPython is a python library used to interact with Git repositories"
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5279a7ab369ba336989dcf2a107e5c8e"

DEPENDS += "nativesdk-python3-gitdb"

PYPI_PACKAGE = "GitPython"

SRC_URI[md5sum] = "595016ce8353439bcda0b6863693926b"
SRC_URI[sha256sum] = "f51c24d8c0f733a195447385f5774a5dfe8767f5acfd7994a33755644c6ecc95"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer nativesdk

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

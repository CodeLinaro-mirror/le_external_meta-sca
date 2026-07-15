SUMMARY = "Additional functools in the spirit of stdlib’s functools"
HOMEPAGE = "https://github.com/jaraco/jaraco.functools"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2e21c3f75eb8d9427c8a611a8e83e9d6"

DEPENDS += "\
            python3-coherent-licensed-native \
            python3-more-itertools-native \
            python3-setuptools-scm-native \
            python3-wheel-native \
           "

PYPI_PACKAGE = "jaraco.functools"

SRC_URI[md5sum] = "24f0dae58bf6fadad9340a29e2353b56"
SRC_URI[sha256sum] = "880c577ec9720b3a052d5bc611fb9f2269b3d87902ef42440df443b88e443280"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-more-itertools"

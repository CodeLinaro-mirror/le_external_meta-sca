SUMMARY = "Module for decorators, wrappers and monkey patching"
HOMEPAGE = "http://wrapt.readthedocs.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=63a78af2900bfcc5ce482f3b8d445898"

DEPENDS += "python3-wheel-native"

PYPI_PACKAGE = "wrapt"

SRC_URI[md5sum] = "cb2ad46e47667cc722c87d3f682d01ce"
SRC_URI[sha256sum] = "fd6390aab9e8aa40c52eff3c180f098e8d9f5894b1fd4c4fd2c207067b33ed16"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"
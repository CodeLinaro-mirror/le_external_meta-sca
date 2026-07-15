SUMMARY = "Argcomplete provides command line tab completion."
HOMEPAGE = "https://github.com/kislyuk/argcomplete"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=2ee41112a44fe7014dce33e26468ba93"

DEPENDS += "python3-hatch-vcs-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI[sha256sum] = "afde224f753f874807b1dc1414e883ab8fe0cda9c04807b6047dcb8e1ac23913"

PYPI_PACKAGE = "argcomplete"

inherit pypi
inherit python_hatchling
inherit_defer native

SUMMARY = "Argcomplete provides command line tab completion."
HOMEPAGE = "https://github.com/kislyuk/argcomplete"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=2ee41112a44fe7014dce33e26468ba93"

DEPENDS += "python3-hatch-vcs-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI[sha256sum] = "6926a3a70ae70dce1f3dfb5cf1fc984278cd163e78ec18ad2ed7fa4fabd8f281"

PYPI_PACKAGE = "argcomplete"

inherit pypi
inherit python_hatchling
inherit_defer native

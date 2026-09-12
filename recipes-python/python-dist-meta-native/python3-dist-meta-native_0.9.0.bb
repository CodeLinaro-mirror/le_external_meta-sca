SUMMARY = "Parse and create Python distribution metadata."
HOMEPAGE = "https://github.com/repo-helper/dist-meta"

DEPENDS += "python3-hatch-requirements-txt-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2a484934fb535cddc2470eef202da5a2"

SRC_URI[sha256sum] = "fa16ebd5574744a09596ab342083a11d7209d8d05cf32891d1c985be7ec0cbd7"

inherit pypi
inherit python_hatchling
inherit_defer native

PYPI_PACKAGE = "dist_meta"

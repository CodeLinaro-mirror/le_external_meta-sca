SUMMARY = "Typing stubs for setuptools"
HOMEPAGE = "https://github.com/python/typeshed"

LICENSE = "Apache-2.0"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI[sha256sum] = "09bedc248ebbb7a232c9419dfcdca329706e61bf2aa5743e9424d027f1d956b4"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

PYPI_PACKAGE = "types_setuptools"
